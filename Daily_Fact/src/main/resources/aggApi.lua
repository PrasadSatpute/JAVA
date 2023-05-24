-- count and sum reducer
local function add_values(val1, val2)
    return (val1 or 0) + (val2 or 0)
end

-- count mapper
-- note closures are used to access aggregate parameters such as bin
local function rec_to_count_closure(bin)
    local function rec_to_count(rec)
    -- if bin is specified: if bin exists in record return 1 else 0; if no bin is specified, return 1
        return (not bin and 1) or ((rec[bin] and 1) or 0)
    end
    return rec_to_count
end

-- count
function count(stream)
    return stream : map(rec_to_count_closure()) : reduce(add_values)
end